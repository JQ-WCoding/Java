const myArray = ['A', 'V'];

let arr = myArray.map((item) => item);

console.log(arr);

const contacts = {
    familyName: 'Lee',
    name      : 'Cat',
    age       : 23,
};

let {familyName, name, age} = contacts;

console.log(contacts);

for (let contactsKey in contacts) {
    console.log(contactsKey);
    console.log(Object.keys(contactsKey));
}

console.log(familyName);
console.log(name);
console.log(age);