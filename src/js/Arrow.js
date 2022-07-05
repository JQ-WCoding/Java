const myArray = [ 'A', 'V' ];

let arr = myArray.map( ( item ) => item );

console.log( arr );

const contacts = {
    familyName: 'Lee',
    name: 'Cat',
    age : 23
};

let { familyName, name, age } = contacts;
console.log( familyName );
console.log( name );
console.log( age );