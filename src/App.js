import './App.css';
import {useState}from'react';

function Square({value,onClick}){
  return <button className='square' onClick={onClick}>{value}</button>
}

function Board(){
  const [xIsNext, setxIsNext]=useState(true);
  const [squares, setSquares]=useState(Array(9).fill(null))
  
  function Winner(squares){
    const lines=[ 
      [0,1,2],
      [3,4,5],
      [6,7,8],
      [0,3,6],
      [1,4,7],
      [2,5,8],
      [0,4,8],
      [2,4,6]
    ]

    for(let i=0;i<lines.length;i++){
      const [a,b,c]=lines[i];
      if(squares[a]&&squares[a]===squares[b] && squares[a] === squares[c]){
        console.log("You're Winner! Congraturation~!");
        return squares[a]
      }
    }
    return null;
  }

  function handleClick(i){

    if(squares[i]||Winner(squares)){
      return
    }

    const nextSquares = squares.slice();
    nextSquares[i]=xIsNext ? 'X':'O';
    setSquares(nextSquares);
    setxIsNext(!xIsNext);
  }
  console.log(squares)

  return(
    <>
    <div className='board-row'>
      <Square value={squares[0]} onClick={()=>handleClick(0)}></Square>
      <Square value={squares[1]} onClick={()=>handleClick(1)}></Square>
      <Square value={squares[2]} onClick={()=>handleClick(2)}></Square>
    </div>
    <div className='board-row'>
      <Square value={squares[3]} onClick={()=>handleClick(3)}></Square>
      <Square value={squares[4]} onClick={()=>handleClick(4)}></Square>
      <Square value={squares[5]} onClick={()=>handleClick(5)}></Square>
    </div>
    <div className='board-row'>
      <Square value={squares[6]} onClick={()=>handleClick(6)}></Square>
      <Square value={squares[7]} onClick={()=>handleClick(7)}></Square>
      <Square value={squares[8]} onClick={()=>handleClick(8)}></Square>
    </div>
    </>
  )
}

function App() {
  return (
    <>
      <Board/>
    </>
  );
}

export default App;
