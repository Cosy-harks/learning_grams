interface Vehical{
	go();
	stop();
	turn(turn:string);
}

class Car implements Vehical{
	id: string;
	name: string;

	constructor(id:string,name:string){
		this.id = id;
		this.name = name;
	}
	go() {
		console.log("moving forward")
	}
	stop() {
		console.log("slowing down")
		console.log("...")
		console.log("stopped")
	}
	turn(turn: string) {
		switch(turn){
			case "left":
				console.log("turning left")
				break;
			case "right":
				console.log("turning right")
				break
			default:
				console.log("going straight")
		}
	}


}