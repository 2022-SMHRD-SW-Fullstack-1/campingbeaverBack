import './App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom'
import Header from './components/Header';
import Products from './components/Products';
import Detail from './components/Detail';
import Join from './components/Join.js';

function App() {
  return (
    <BrowserRouter>
    <div>
      <Header/>
      <Routes>
        {/* Route 필수 속성 2 가지 :
        path(경로) , element(컴포넌트) */}
        <Route path='/' element={<Products/>}/>
        <Route path='/detail:num' element={<Detail/>}/>
        <Route path='/join' element={<Join/>}/>
      </Routes>
    </div>
       </BrowserRouter>
  );
}

export default App;
