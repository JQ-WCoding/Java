import {Component} from 'react';
import ReactDom from 'react-dom';
import React, {useState} from 'react';

const test = {
    inner1: 'hi',
    inner2: 'react'
}

const [text, setText] = useState( test.inner1 );
const [showText, setShowText] = useState( true );

// const setInitialText = useCallback( ref => ref && setText( test.inner1 ) );

const pressButton = () => {
    let tagName = document.getElementsByTagName( 'h2' );
    console.log( tagName );
    setText( 'Pressed' );
    setShowText( false );

    setting( 'Pressed' );
    afterBuilding();
    final();
}

const final = () => {
    this.inner1 = 'rehi';
}

function afterBuilding() {
    console.log( 'Old Version of Function' );
}

const endBuild = () => {
    console.log( 'end build' );
    alert( 'Impact' );
}

const setting = ( text ) => {
    this.text( text );
    endBuild();
}

/* 렌더링 시점 => 해당 컴포넌트에 대해 읽고 그에 맞게 input 속성 등을 넣어 준다. */
/* 렌더링 이후에 추가적인 행위는 함수를 통해 건들인다. */
class Day extends Component {
    render() {
        return <div>
            <h1>{test.inner1}</h1>
            <h2>{test.inner2}</h2>
            <div>{text}</div>
            <div>{showText}</div>

            <button onClick={pressButton}>plus tags button</button>
        </div>;
    }
}

ReactDom.render(
    <Day/>,
    document.getElementById( 'root' ),
);