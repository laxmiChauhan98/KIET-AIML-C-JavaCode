// src/components/AddEmployee.js
import React, { useState } from "react";
import EmployeeService from "../services/EmployeeService";
import { useNavigate } from "react-router-dom";

export default function AddEmployee() {
  const [employee, setEmployee] = useState({
    name: "",
    email: "",
    department: "",
    salary: ""
  });

  const navigate = useNavigate();

  const handleChange = (e) => {
    setEmployee(prev => ({ ...prev, [e.target.name]: e.target.value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // convert salary to number
    const payload = { ...employee, salary: parseFloat(employee.salary || 0) };
    EmployeeService.addEmployee(payload)
      .then(() => {
        alert("Employee added");
        navigate("/");
      })
      .catch(err => {
        console.error(err);
        alert("Error adding employee");
      });
  };

  return (
    <div>
      <h2>Add Employee</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Name:</label><br/>
          <input name="name" value={employee.name} onChange={handleChange} required/>
        </div>
        <div>
          <label>Email:</label><br/>
          <input name="email" value={employee.email} onChange={handleChange} type="email" required/>
        </div>
        <div>
          <label>Department:</label><br/>
          <input name="department" value={employee.department} onChange={handleChange} />
        </div>
        <div>
          <label>Salary:</label><br/>
          <input name="salary" value={employee.salary} onChange={handleChange} type="number" step="0.01"/>
        </div>
        <div style={{ marginTop: 10 }}>
          <button type="submit">Save</button>
          <button type="button" onClick={() => navigate("/")} style={{ marginLeft: 8 }}>Cancel</button>
        </div>
      </form>
    </div>
  );
}
