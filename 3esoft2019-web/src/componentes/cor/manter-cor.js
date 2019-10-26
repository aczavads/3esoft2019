import React, {useState} from 'react';
import axios from 'axios';


const onClick = () => {
    alert("Olha, clicou!");
}


const ManterCor = () => {
    const [contador, setContador] = useState(0);
    const [cores, setCores] = useState([]);


    const getCores = async () => {
        await axios.get('/api/cores').then( (response) => {
            //console.log("cores", response.data);
            setCores(response.data);
        });
    }

    const delCor = async (id) => {
        await axios.delete(`/api/cores/${id}`);
        getCores();
    }
    

    const corpoDaTabela = cores.map( (cor) => {
        return (
            <tr key={cor.id}>
                <td>{cor.id}</td>
                <td>{cor.nome}</td>
                <td><button onClick={() => delCor(cor.id)}>Delete</button></td>
            </tr>
        );
    });

 
    return (
        <div>
            {contador}
            <button onClick={() => setContador(contador+1)}>Incrementar</button>
            <button onClick={getCores}>Get Cores</button>
            <button onClick={onClick}>Alert</button>
            <button onClick={() => console.log("Ulha!")}>Console</button>            
            <br/>
            Manter Cor!
            <br/>
            <table border='1'>
                <thead>
                <tr>
                    <td>id</td>
                    <td>nome</td>
                    <td>actions</td>
                </tr>
                </thead>
                <tbody>
                    {corpoDaTabela}
                </tbody>
            </table>
        </div>
    );
}

export default ManterCor;