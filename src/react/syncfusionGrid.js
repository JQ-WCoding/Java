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
}

const setting = ( text ) => {
    this.text( text );
}

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