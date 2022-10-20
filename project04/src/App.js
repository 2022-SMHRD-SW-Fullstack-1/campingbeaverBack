import './App.css';
import {Routes, Route} from 'react-router-dom'
import Main from './components/Main';
import About from './components/About';
import MyPage from './components/MyPage';
import Product from './components/Product';

function App() {
  return (
    <div >
      <h1>Welcome to React Router!</h1>
      {/* Routes : 여러 Route 들을 감싸서
                  그 중 요청된 라우트 하나만 렌더링 해준다
          Q. Switch? : Routes의 옛날방식

      */}
      <Routes>
        {/* Route 필수 속성 2 가지 :
        path(경로) , element(컴포넌트) */}
        <Route path='/' element={<Main/>}></Route>
        <Route path='/about' element={<About/>}></Route>
        
        {/* 로그인 상태에 따라 다르게 처리 */}
        <Route path='/mypage' element={<MyPage/>}></Route>
        
        {/* url 파라미터를 이용 useParams */}
        <Route path='/product:num' element={<Product/>}></Route>

      </Routes>

    </div>
  );
}

export default App;
