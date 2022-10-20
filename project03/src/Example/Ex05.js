import React from 'react'
import PhotoCard from './Ex05Com/PhotoCard'

const Ex05 = () => {

    // 조건1) Ex05Com 폴더 => PhotoCard.js 컴포넌트 사용!
    // 조건2) member 라는 배열 안에 name. 과 url 주소가포함된
                    //객체들을 생성 할 것
    // 조건3) 만약 배열에 값을 추가하면 바로 새로운 카드들이
                    // 생기게 할 것
    // *** 다하면 디자인을 진행

    let member = [{
        name : '아이유',
        url : 'https://cdn-lostark.game.onstove.com/2021/event/210324_landing/images/m/mokoko_01.gif'
    },{
        name : '수지',
        url : 'https://blog.kakaocdn.net/dn/Zr54L/btq5i4iNpnF/G2Znh8yAr3ZFKM4mEr4rK0/img.png'
    },{
        name : '나연',
        url : 'https://cdn-lostark.game.onstove.com/2021/event/210714_event2/images/pc/mokoko_eating.png?eb94ed1e8157fc2354fd84cb3ea57705'
    },
{
 name : '메롱',
 url : ''
}]
    
    let container ={
        display : 'flex',
        flexDirection : 'row'
    }

  return (
    <div style={container}>
        {member.map(item => (<PhotoCard key={item.name} item={item}></PhotoCard>))}
    </div>
  )
}

export default Ex05