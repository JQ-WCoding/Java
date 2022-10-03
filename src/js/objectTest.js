const array1 = [1, 2];
const array2 = [4, 5, 6];

// new Version me
let arrayTest = [...array1, ...array2];
let arrayNew = [...array1, ...array2, 7, 8, 9];

console.log( arrayTest );
console.log( arrayNew );


// old version me
let arrayOld = [];
array1.forEach( i => arrayOld.push( i ) );
array2.forEach( i => arrayOld.push( i ) );
console.log( arrayOld );

let arrayOld2 = [];
for ( let i = 0; i < array1.length; i++ ) {
    arrayOld2.push( array1[i] );
}

for ( let i = 0; i < array2.length; i++ ) {
    arrayOld2.push( array2[i] );
}

console.log( arrayOld2 );

let arrayList = [];
arrayOld.filter( i => i / 2 === 1 ).map( arrayList.push );

console.log( arrayList );