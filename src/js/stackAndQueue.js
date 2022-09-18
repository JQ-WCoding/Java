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

/* printOne -> Two -> Three 의도했지만
 one -> three -> two 순서로 실행됨 */



// Stack 의 예시
// 스택은 예정된 순서대로 진행되는 형식
// 기본적으로 스택의 형식으로 진행
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