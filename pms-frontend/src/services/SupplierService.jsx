import React, {Component} from 'react';
import axios from "axios";

const API_SUPPLIER_BACKEND_URL = "http://localhost:5000/api/v1/supplier/";
class SupplierService extends Component {
   constructor(props) {
       super(props);
   }
    //TODO: Function for Supplier LoginSupplier
    login(email,password){
        return axios.post(API_SUPPLIER_BACKEND_URL+"login",{
            email,
            password
        }).then(response =>{
            console.log(response.data);
            if(response.data.accessToken){
                sessionStorage.setItem("supplier", JSON.stringify(response.data));
                console.log(JSON.stringify(response.data));
            }
            console.log(response.data);
            return response.data;
        });
    }

}

export default new SupplierService;