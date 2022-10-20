import React, { useEffect, useState } from 'react'

const Ex08 = () => {

    // a. constructor 대체
    //  => 변수 초기화 , state 관리
    console.log('a, 함수초기화')

    const [num, setNum] = useState(0)
    const btnCk = () => {
        setNum(num+1)
    }

    // c. 화면 mount
    // usEffect(()=>{},[])
    // => API Call

    useEffect(()=>{
        console.log('c. Mount')
    },[])


    // d. 값 update
    // useEffect(()=>{},[변화를 감지할 대상])
    // 변화를 감지하는 대상은 복수가 될 수도 있다
    
    useEffect(()=>{
        console.log('update!')
    },[num])



  return (
      <div>
        {console.log('b. rendering')}
        {/*  b.render 대체 */}
        {/* //=> 화면 구성요소  */}
        <p>{num}</p>
        <button onClick={btnCk}>+1</button>
    </div>
  )
}

export default Ex08