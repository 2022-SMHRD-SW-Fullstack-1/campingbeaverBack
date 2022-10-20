import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import MyPage from './MyPage'

const Main = () => {
  const navigate = useNavigate()

  const [userState, setUserState] = useState(true)
  const goToMyPage = () => {
    // login 상태면 mypage로 이동,
    // 그렇지 않으면 about으로 이동

    userState == true
      ? navigate('/mypage')
      : navigate('/about')
  }
  return (
    <div>Main
      <br></br>
      {/* Link Component 
      - 브라우저 주소를 바꿔주는 역할
      - 실제로 페이지를 불러오지는 않는다 (a태그와의 차이)
      */}
      <Link to='./about'>About으로 이동</Link>
      
      <br></br>
      <Link to='./product:num'>Product 이동</Link>
      <br></br>
      <button onClick={goToMyPage}>마이페이지로 이동하기</button>
    </div>
  )
}

export default Main