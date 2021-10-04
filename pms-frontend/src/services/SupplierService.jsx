import axios from "axios";
import connection from "./connection.json";

const SERVICE_URL = "/api/v1/supplier";
const URL = connection.localAddress + SERVICE_URL;

export default new class OrderService {

    getSupplierByStatus(status) {
        return axios.get(URL + "/get-supplier-by-status/" + status);
    }

    getItemBySupplierId(id) {
        return axios.get(URL + "/get-item-by-supplier-id/" + id);
    }

    getItemById(id) {
        return axios.get(URL + "/get-item-by-item-id/" + id);
    }

}