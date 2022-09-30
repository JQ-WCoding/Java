const array1 = [1, 2];
const array2 = [4, 5, 6];

// new Version me
let arrayTest = [...array1, ...array2];

console.log( arrayTest );


// old version me
let arrayOld = [];
array1.forEach( i => arrayOld.push( i ) );
array2.forEach( i => arrayOld.push( i ) );
console.log( arrayOld );