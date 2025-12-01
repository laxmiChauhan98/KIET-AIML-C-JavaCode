// src/components/EmployeeList.js
import React, { useEffect, useState } from "react";
import EmployeeService from "../services/EmployeeService";
import { Link } from "react-router-dom";

export default function EmployeeList() {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    loadData();
  }, []);

  const loadData = () => {
    EmployeeService.getEmployees()
      .then(res => setEmployees(res.data))
      .catch(err => console.error(err));
  };

  const deleteEmp = (id) => {
    if (!window.confirm("Are you sure to delete this employee?")) return;
    EmployeeService.deleteEmployee(id)
      .then(() => loadData())
      .catch(err => console.error(err));
  };

  return (
    <div>
      <h2>Employees</h2>
      <Link to="/add"><button>Add Employee</button></Link>
      <table border="1" cellPadding="8" style={{ marginTop: 10, width: "100%" }}>
        <thead>
          <tr>
            <th>ID</th><th>Name</th><th>Email</th><th>Department</th><th>Salary</th><th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {employees.map(e => (
            <tr key={e.id}>
              <td>{e.id}</td>
              <td>{e.name}</td>
              <td>{e.email}</td>
              <td>{e.department}</td>
              <td>{e.salary}</td>
              <td>
                <Link to={`/edit/${e.id}`}><button>Edit</button></Link>
                <button onClick={() => deleteEmp(e.id)} style={{ marginLeft: 8 }}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

