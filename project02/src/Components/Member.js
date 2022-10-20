import React from 'react'

const welStyle = {
  width: '300px',
  height: '50px',
  fontSize: '20px',
  color: 'blue',
  //backgroundColor: 'yellow',
  textAlign: 'center',
  border: '1px solid #444444'
  
}

// 매개변수로 object를 적을 때 주의!
// 1) ({속성}) => 중괄호 생략 금지
// 2) 다중 속성을 가져올 때
//    ({속성},{속성}) => 틀린것임
//    ({속성, 속성}) => 하나의 객체({}) 안에 다중 속성
const Member = ({ name, teamName }) => {
  return (
    <div >
      <table style={welStyle} align={'center'}>
        <tr>{teamName}</tr>
        <td>{name}</td>
      </table>
      <br></br>
    </div>
  )
}

export default Member