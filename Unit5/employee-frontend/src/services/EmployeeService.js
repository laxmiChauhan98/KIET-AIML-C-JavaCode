// src/services/EmployeeService.js
import axios from "axios";

const BASE_URL = "http://localhost:8080/api/employees";
// If you prefer proxy (optional), you can set "proxy":"http://localhost:8080" in package.json
// and use const BASE_URL = "/api/employees";

class EmployeeService {
  getEmployees() {
    return axios.get(BASE_URL);
  }
  getEmployeeById(id) {
    return axios.get(`${BASE_URL}/${id}`);
  }
  addEmployee(emp) {
    return axios.post(BASE_URL, emp);
  }
  updateEmployee(id, emp) {
    return axios.put(`${BASE_URL}/${id}`, emp);
  }
  deleteEmployee(id) {
    return axios.delete(`${BASE_URL}/${id}`);
  }
}

export default new EmployeeService();
