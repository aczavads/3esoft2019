import React from 'react';
import logo from './logo.svg';
import './App.css';
import ManterCor from './componentes/cor/manter-cor';


/*
const App = function () {
  return (
    <div>
      <h3>Hello Formandos 2020! Função anônima</h3>
    </div>
  );
};
*/

/*/
function App() {
  return (
    <div>
      <h3>Hello Formandos 2020! Função convencional.</h3>
    </div>
  );
}
*/

/*
class App extends React.Component {
  render() {
    return (
      <div>
        <h3>Hello Formandos 2020! Componente Class Based!</h3>
      </div>
    );      
  }
}
*/

const Titulo = () => {
  return (
    <h3>Hello Formandos 2020! Componente Titulo! :D</h3>
  );
}

const App = () => {
  return (
    <div>
      <Titulo></Titulo>  
      <ManterCor></ManterCor>
    </div>
  );
};

export default App;
