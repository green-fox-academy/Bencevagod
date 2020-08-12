let arr = ["koal", "pand", "zebr"];
console.log(arr);

function appendA(array) {
    return array.map(function(e) {
        //return e+"a"
        return (e+"a")+(e+"a")
    })
};

console.log(appendA(arr));

let matrix = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

for (let i of matrix) {
    // for (let j of matrix) {
    //     console.log(j);
    // }
    console.log(i);
}

function name(param) {
    return param
}

let neam = name("kaki");

console.log(neam);

let planetList = ['Mercury', 'Venus', 'Earth', 'Mars', 'Jupiter', 'Uranus', 'Neptune'];

function putASaturn(arr) {
    arr.splice(5, 0, 'Saturn');
    return arr.join()
}

console.log(putASaturn(planetList));