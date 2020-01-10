var Car = /** @class */ (function () {
    function Car(id, name) {
        this.id = id;
        this.name = name;
    }
    Car.prototype.go = function () {
        console.log("moving forward");
    };
    Car.prototype.stop = function () {
        console.log("slowing down");
        console.log("...");
        console.log("stopped");
    };
    Car.prototype.turn = function (turn) {
        switch (turn) {
            case "left":
                console.log("turning left");
                break;
            case "right":
                console.log("turning right");
                break;
            default:
                console.log("going straight");
        }
    };
    return Car;
}());
