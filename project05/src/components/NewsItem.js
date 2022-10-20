import React from 'react'

const NewsItem = ({news}) => {

    console.log(news)
  return (
    <div>
        <img src={news.urlToImage} width="150px"></img>
        <a href={news.url}></a>
        <h2>{news.title}</h2>
        <p>{news.description}</p>
    </div>
  )
}

export default NewsItem