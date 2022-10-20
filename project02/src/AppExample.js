import React from 'react'
import Member from './Components/Member'


let team = '팀이름'
function AppExample() {

    return (
        <div>
            <Member name="임아해" teamName={team}></Member>
            <Member name="주상민" teamName={team}></Member>
            <Member name="고연주" teamName={team}></Member>
            <Member name="마준호" teamName="44444444"></Member>
        </div>
    )
    
}
export default AppExample