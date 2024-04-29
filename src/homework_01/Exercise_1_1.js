let alice = {
    firstname: "Alice",
    lastname: "Wonderland",
    age: 24,
    getName: function() {
        return `${this.firstname} ${this.lastname}`
    }
}

let roleProf = {
    getDescription() {
        return `${this.getName()}, ${this.chair}`;
    },
    getInfo() {
        return `${this.getDescription()}, ${this.positionKind} at the ${this.level} level`;
    }
}

let roleHeadExamBoard = {
    getDescription() {
        return `${roleProf.getDescription.call(this)}, head of the examination board`;
    },
    getInfo() {
        return `${roleProf.getInfo.call(this)}`;
    }
}

let roleHeadDept = {
    getDescription() {
        return `${roleProf.getDescription.call(this)}, head of the department`;
    },
    getInfo() {
        return `${roleProf.getInfo.call(this)}`;
    }
}

function clone(object) {
    let clone = {};
    for(let key in object) {
        clone[key] = object[key];
    }
    return clone;
}

function validatePositionKind(positionKind) {
    if (["full professor", "honorary professor", "Jülicher Model professor"].includes(positionKind)) {
        return positionKind;
    } else {
        throw new Error("Invalid position kind. Position kind must be one of: 'full professor', 'honorary professor', or 'Jülicher Model professor'");
    }
}

function validateLevel(level) {
    if (["W1", "W2", "W3"].includes(level)) {
        return level;
    } else {
        throw new Error("Invalid professor level. Professor level must be one of: 'W1', 'W2', or 'W3'");
    }
}

function makeProf(person, chair, positionKind, level) {
    let prof = clone(roleProf);

    // Set the person object as the prototype of the professor object
    prof.__proto__ = person;

    // Assign chair property
    prof.chair = chair;

    // Validate positionKind and level
    prof.positionKind = validatePositionKind(positionKind);
    prof.level = validateLevel(level);

    return prof;
}

function makeHeadExamBoard(person, chair, positionKind, level) {
    let headExamBoard = clone(roleHeadExamBoard);

    // Set the person object as the prototype of the professor object
    headExamBoard.__proto__ = person;

    // Assign chair property
    headExamBoard.chair = chair;

    // Validate positionKind and level
    headExamBoard.positionKind = validatePositionKind(positionKind);
    headExamBoard.level = validateLevel(level);

    return headExamBoard;
}

function makeHeadDept(person, chair, positionKind, level) {
    let headDept = clone(roleHeadDept);

    // Set the person object as the prototype of the professor object
    headDept.__proto__ = person;

    // Assign chair property
    headDept.chair = chair;

    // Validate positionKind and level
    headDept.positionKind = validatePositionKind(positionKind);
    headDept.level = validateLevel(level);

    return headDept;
}

let roleProfAlice = makeProf(alice, "software engineering", "full professor", "W2");
console.log(roleProfAlice.getInfo());

let roleHeadExamBoardAlice = makeHeadExamBoard(alice, "software engineering", "full professor", "W2");
console.log(roleHeadExamBoardAlice.getInfo());

let roleHeadDeptAlice = makeHeadDept(alice, "software engineering", "full professor", "W2");
console.log(roleHeadDeptAlice.getInfo());