import React, {useEffect, useState} from 'react'

import axios from 'axios'

const Ex10 = () => {
    let url = ''

    const [city, setCity] = useState('')
    const [des, setDes] = useState('')
    const [temp, setTemp] = useState(0)

    const getCurrentLocation = ()=>{
        navigator.geolocation.getCurrentPosition((position)=>{
            console.log('현재 위치의 위도 : ',position.coords.latitude)
            console.log('현재 위치의 경도 : ',position.coords.longitude)
            
            // 내 위치를 구한 이후 => 날씨 데이터 요청
            getWeatherData(position.coords.latitude,position.coords.longitude)
        })
    }

    const getWeatherData = (위도 , 경도)=>{
        console.log(위도, 경도)
        url = `https://api.openweathermap.org/data/2.5/weather?
        lat=${위도}&lon=${경도}&
        appid=d98ae2c3057b1f588501393dc077fc5f&units=metric`
        
        axios.get(url)
            .then((res)=>{
                console.log(res.data)

                setCity(res.data.name)
                setDes(res.data.weather[0].description)
                setTemp(res.data.main.temp)
            })
            .catch(()=>{alert('error')})

    }

    useEffect(()=>{
        getCurrentLocation()
    },[])
  return (
    <div>
        <h1>{city}</h1>
        <p>{des}</p>
        <p>현재 온도 : {temp}°C </p>
    </div>
  )
}

export default Ex10