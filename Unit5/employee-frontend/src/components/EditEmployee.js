// src/components/EditEmployee.js
import React, { useEffect, useState } from "react";
import EmployeeService from "../services/EmployeeService";
import { useNavigate, useParams } from "react-router-dom";

export default function EditEmployee() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [employee, setEmployee] = useState({
    name: "",
    email: "",
    department: "",
    salary: ""
  });

  useEffect(() => {
    EmployeeService.getEmployeeById(id)
      .then(res => {
        const data = res.data;
        setEmployee({
          name: data.name || "",
          email: data.email || "",
          department: data.department || "",
          salary: data.salary || ""
        });
      })
      .catch(err => {
        console.error(err);
        alert("Error fetching employee");
      });
  }, [id]);

  const handleChange = (e) => {
    setEmployee(prev => ({ ...prev, [e.target.name]: e.target.value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const payload = { ...employee, salary: parseFloat(employee.salary || 0) };
    EmployeeService.updateEmployee(id, payload)
      .then(() => {
        alert("Employee updated");
        navigate("/");
      })
      .catch(err => {
        console.error(err);
        alert("Error updating employee");
      });
  };

  return (
    <div>
      <h2>Edit Employee</h2>
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
          <button type="submit">Update</button>
          <button type="button" onClick={() => navigate("/")} style={{ marginLeft: 8 }}>Cancel</button>
        </div>
      </form>
    </div>
  );
}
