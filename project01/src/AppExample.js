function AppExample(){
    
    // 1. 사용자에게 이름을 입력받아준다
    // prompt('이름을 말해주세요!')
    let name =prompt('이름을 입력하세요')

    // 2. 현재 날짜를 가지고 올 것
    // 현재 몇월? getMonth()
    let today = new Date()
    let date = today.toLocaleDateString()
    console.log('오늘의 날짜는 ', date)

    let month = today.getMonth()+1
    console.log('이번 달은', month)

    // 3. 
    // 조건1) 3~5월 : 봄
    // 조건2) 6~8월 : 여름
    // 조건3) 9~11월 : 가을
    // 조건4) 12,1,2월 : 겨울
    
    let season = ''
    if(month >=3 && month <= 5){
        season = '봄'
    }else if(month >= 6 && month <= 8){
        season = '여름'
    }else if(month >= 9 && month <= 11){
        season = '가을'
    }else {
        season = '겨울'
    }
   
    // 결과창
    // 2022.9.27
    // <hr></hr>
    // 000님 지금은 가을입니다. 좋은 하루 보내세요!
    
    return(
        <>
        <h1>{date}</h1>
        <hr/>
        <h4>{name}님 지금은 {season}입니다. 좋은 하루 보내세요</h4>
        </>
    )
}


export default AppExample;