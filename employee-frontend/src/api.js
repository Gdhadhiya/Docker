import axios from "axios";

const API_URL = "http://localhost:8080";

export const getEmployees = () =>
  axios.get(`${API_URL}/employees`);

export const addEmployee = (employee) =>
  axios.post(`${API_URL}/employees`, employee);

export const deleteEmployee = (id) =>
  axios.delete(`${API_URL}/employees/${id}`);