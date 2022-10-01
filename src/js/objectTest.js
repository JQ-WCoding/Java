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