import axios from "axios";
import connection from "./connection.json";

const SERVICE_URL = "/api/v1/project";
const URL = connection.localAddress + SERVICE_URL;

export default new class ProjectService {

    createProject(value) {
        return axios.post(URL + "/save/", value);
    }

    getAllProjects() {
        return axios.get(URL + "/get/");
    }

    getProjectById(id) {
        return axios.get(URL + "/getById/" + id);
    }

    getProjectBySiteId(id) {
        return axios.get(URL + "/getBySiteId/" + id);
    }

    deleteProjectById(id) {
        return axios.delete(URL + "/deleteById/" + id);
    }

    updateProject(value) {
        return axios.put(URL + "/update/", value);
    }

}