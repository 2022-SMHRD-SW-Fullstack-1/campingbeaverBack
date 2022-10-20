import React from 'react'
import { useNavigate } from 'react-router-dom'


const MyPage = () => {
    const navigate = useNavigate()

    // useNavigate : 페이지 이동을 도와주는 React hooks
    const goToMain = () => {
      navigate('/')
    }
  return (
    <div>MyPage
       <h3>유저 정보입니다. </h3>
       <br></br>
      <button onClick={goToMain}>메인으로 돌아가기</button>
    </div>
  )
}

export default MyPage