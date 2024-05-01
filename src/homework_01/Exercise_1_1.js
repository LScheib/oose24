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

function makeRole(person, role, chair, positionKind, level) {
    let newRole = clone(role);

    // Set the person object as the prototype of the professor object
    newRole.__proto__ = person;

    // Assign chair property
    newRole.chair = chair;

    // Validate positionKind and level
    newRole.positionKind = validatePositionKind(positionKind);
    newRole.level = validateLevel(level);

    return newRole;
}

let roleProfAlice = makeRole(alice, roleProf, "software engineering", "full professor", "W2");
console.log(roleProfAlice.getInfo());

let roleHeadExamBoardAlice = makeRole(alice, roleHeadExamBoard, "software engineering", "full professor", "W2");
console.log(roleHeadExamBoardAlice.getInfo());

let roleHeadDeptAlice = makeRole(alice, roleHeadDept, "software engineering", "full professor", "W2");
console.log(roleHeadDeptAlice.getInfo());