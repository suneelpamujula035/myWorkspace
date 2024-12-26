var products = [
    { "id": 101, "name": "name1", "cost": 2000 },
    { "id": 102, "name": "name2", "cost": 4000 },
    { "id": 103, "name": "name3", "cost": 2800 },
    { "id": 104, "name": "name4", "cost": 7500 },
    { "id": 105, "name": "name5", "cost": 9800 }
];
products.forEach(function (elements, index) {
    console.log(elements.id, elements.name, elements.cost);
});
