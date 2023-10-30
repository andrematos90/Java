const url = "http://localhost:8080/parking-spot"

async function getParkingSpot(){
    const response = await fetch(url);
    console.log(response);
    
}