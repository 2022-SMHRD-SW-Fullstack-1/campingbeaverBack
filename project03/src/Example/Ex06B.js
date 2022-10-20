import React,{useRef} from 'react'

const Ex06B = () => {

    // useRef : 리액트에서 DOM을 선택해야할 때
    //          JS의 document.getElementByID(),
    //               document.querySelector() 등
    //          DOM에 접근해야하는 함수를 대체하는 리액트 훅
    

    const comRef = useRef()
    const btnCk = ()=> {
        console.log('댓글', comRef.current.value)
    }
        return (
    <div>
        <input 
        type="text"
        ref={comRef}
        ></input>
        <button onClick={btnCk}>댓글추가</button>
    </div>
  )
}

export default Ex06B