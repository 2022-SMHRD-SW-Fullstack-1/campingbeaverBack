import React from 'react'
import {useState} from 'react'

const Ex02 = () => {
    // 1. '좋아요' 버튼 클릭 시, 버튼의 내용이 '좋아요 취소'로 변경
    //    '좋아요 취소' 버튼 클릭 시, 버튼의 내용이 '좋아요' 로 변경
    
    // 2. '좋아요' 버튼 클릭 시, 비어있는 하트가 꽉찬 하트로 변경
    //    '좋아요 취소' 버튼 클릭 시, 꽉찬 하트가 비어있는 하트로 변경
    
    const [likeTxt, setLikeTxt] = useState('좋아요')
    const [likeEmoji,setLikeEmoji] = useState('♡')
    const handleLike=()=>{
        likeTxt =='좋아요'
        ? setLikeTxt('좋아요 취소') 
        : setLikeTxt('좋아요')

        likeEmoji == '♡'
        ? setLikeEmoji('♥')
        : setLikeEmoji('♡')
    }
    
    const [likeNum, setLikeNum] = useState(0)
    
    // 3. '+1' 버튼 클릭 시, 숫자가 1씩 증가
    const increase=()=>{
        setLikeNum(likeNum+1)
    }
    
    // 4. '-1' 버튼 클릭 시, 숫자가 1씩 감소
    //     (단, 0밑으로는 내려가지 않도록 하기)
    const decrease=()=>{
        // if(likeNum>0){ //if문으로 조건 설정
        //     setLikeNum(likeNum-1)
        // }else if(likeNum<=0){

        // }
        //&&연산자 사용
        likeNum>0 && setLikeNum(likeNum-1)
    }
    
    // 완료 시, 꽉찬하트로 좋아요 5개 만들어서 캡쳐 => slack
    
    

  return (
    <div>
        {/* 이미지, 좋아요버튼, +1버튼, -1버튼 */}
        <img 
        width="200px"
        src="https://c.tenor.com/hXlsX_G7ma0AAAAi/%EC%9B%80%EC%A7%81%EC%9D%B4%EB%8A%94%EB%A1%9C%EC%95%84%EC%BD%98-%EB%AA%A8%EC%BD%94%EC%BD%94.gif">
        </img>
        <p>{likeEmoji}{likeNum}</p>
        <br/>
        <button onClick={handleLike}>{likeTxt}</button>
        <button onClick={increase}>+1</button>
        <button onClick={decrease}>-1</button>
    </div>
  )
}

export default Ex02