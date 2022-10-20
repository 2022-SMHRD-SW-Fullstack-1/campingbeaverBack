import React from 'react'

const CommentList = ({com}) => {
  console.log('현재 댓글 상태', com)
  
  const smallTxt = {
    color : 'gray',
    fontSize : '10px'
  }
  return (
  <div>
    {com.map((item,idx) => (
    <p key={'num'+idx+item.txt}>
      {item.text}
      <span style={smallTxt}> {item.time} </span>
      </p>))}
  </div>
  )
}

export default CommentList