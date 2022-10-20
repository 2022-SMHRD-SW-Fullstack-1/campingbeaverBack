import React from 'react'

const PhotoCard = (props) => {
    console.log('넘어온 값', props)
   
    let boxStyle={
        display: 'flex',
        flexDirection : 'column',
        alignItems : 'center',
        justifyContents : 'center',
        border : '1px solid black'
    }

    let imgStyle ={
        height : '200px'
    }

    return (
        <div style={boxStyle}>
           {props.item.name}
           <img style={imgStyle} src={props.item.url}></img>
        </div>
    )
}

export default PhotoCard