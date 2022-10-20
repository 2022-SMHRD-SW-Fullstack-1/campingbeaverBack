import React from 'react'
import { useNavigate } from 'react-router-dom'

const About = () => {

  const navigate = useNavigate()

  // useNavigate : 페이지 이동을 도와주는 React hooks
  const goTOMain = () => {
    navigate('/')
  }
  return (
    <div>About
      <br></br>
      <button onClick={goTOMain}>Main으로 이동</button>
    </div>
  )
}

export default About