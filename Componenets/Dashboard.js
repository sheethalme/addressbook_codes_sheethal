import React from 'react'
import { useEffect } from "react";
import axios from "axios";
import {useState} from "react";
import './Dashboard.css';



function Dashboard() {
    const [Book,setBooks]=useState([]);
    const [name, setName] = useState("");
    const [pho, setPho] = useState("");


    useEffect(()=>{
        fetchBook();
    },[]);


        function fetchBook(){
        axios.get("http://localhost:8080/api/done").then((res)=>{
          
             setBooks(res.data);
        } );    
        }

    function addContacts(){
        const peopleData={ 
            name:name,
            pho:pho};
            axios.post("http://localhost:8080/api/done",peopleData).then((res)=>{
           fetchBook();
            setName("");
            setPho("");
        })
        .catch(error => { console.error('Error fetching data:', error);
    });
}

    

  return (
    <div>
        <h1>
            DASHBOARD
        </h1>
        <div>
            <input type='text'
            placeholder='enter the persons name'
            value={name}
            onChange={(e) => setName(e.target.value)}
            />
            <br/><br/>

            <input type="text"
            placeholder='enetr the phone number'
            value={pho}
            onChange={(e) => setPho(e.target.value)}/>

            <br/>
            <button onClick={addContacts}>ADD</button>
            <br/><br/>
        </div>
        <ul>
            {Book.map((Bo)=>(
                <li key={Bo.id}>
                    {Bo.name}-{Bo.pho}
                    
                </li>

            ))}
        </ul>
    </div>
  );
}

export default Dashboard;
