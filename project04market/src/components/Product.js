import React from 'react'
import {Link} from 'react-router-dom'
import Detail from './Detail'

const Product = ({item, idx}) => {

    console.log(item)
    const containerStyle={
      border : '1px solid gray',
      display : 'flex',
      flexDirection : 'column'
    }
  return (
    <div style={containerStyle}>
      <img src={item.photo} width='100px'></img>
      <h2>
        <Link to ={'/detail'+idx+'?title='+item.title+'&price='+item.price+'&place='+item.place}>
         {item.title}
        </Link>
        
      </h2>
      <p>{item.price}</p>
      <p>{item.place}</p>
    </div>
  )
}

export default Product