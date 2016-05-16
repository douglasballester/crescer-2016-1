<<<<<<< HEAD
﻿$.validator.methods.date = function (value, element) {
    var date = new Date(value.replace(/(\d{2})[/](\d{2})[/](\d{4})/, "$2/$1/$3")); //31/12/2015
    return this.optional(element) || !/Invalid|NaN/.test(date.toString());
}

$.validator.methods.number = function (value, element) {
=======
﻿$.validator.methods.number = function (value, element) {
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
    var regex = /^(\d*)(\,\d{1,2})?$/; //99999,99
    return this.optional(element) || regex.test(value);
}

<<<<<<< HEAD
=======
$.validator.methods.date = function (value, element) {
    var date = new Date(value.replace(/(\d{2})[/](\d{2})[/](\d{4})/, "$2/$1/$3")); //31/12/2015
    return this.optional(element) || !/Invalid|NaN/.test(date.toString());
}
>>>>>>> 9c6a820787619075ecea444f4b8f1a38855fdfb0
