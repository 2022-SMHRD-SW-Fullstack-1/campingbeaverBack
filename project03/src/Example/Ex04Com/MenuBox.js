import React from 'react'

const MenuBox = (props) => {
    console.log(props.item)
  return (
    <div>
        <h1>{props.item.menu}</h1>
        <h3>{props.item.price}</h3>
    </div>
  )
}

export default MenuBox