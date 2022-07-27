printOne();

// 콜백 큐
setTimeout( printTwo, 1000 );

printThree();

function printOne() {
    console.log( 1 );
}

function printTwo() {
    console.log( 2 );
}

function printThree() {
    console.log( 3 );
}


// Stack 의 예시
functionA();
functionC();

function functionA() {
    functionB();
    console.log( "In functionA" )
}

function functionB() {
    console.log( "In functionB" );
}

function functionC() {
    console.log( "In functionC" );
}