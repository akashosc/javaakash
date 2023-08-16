const canvas=document.querySelector('canvas');
const c=canvas.getContext('2d');
canvas.width=1024
canvas.height=576

c.fillRect(0,0,canvas.width,canvas.height);
class sprit{
    constructor({position,velocity}){
        this.position=position
        this.velocity=velocity
    }
    draw(){
       c.fillStyle='red'
       c.fillRect(this.position.x,this.position.y,50,100)
    }
    update(){
        this.draw()
        this.position.y+=10
    }
}
const player=new sprit({position:{
    x:0,
    y:0
},velocity:{
    x:0,y:0
}})
const enemy=new sprit({position:{
    x:400,
    y:100
},velocity:{
    x:0,y:0
}})

function animate(){
    window.requestAnimationFrame(animate);
    c.fillStyle='black'
    c.fillRect(0,0,canvas.width,canvas.height);
    player.update()
    enemy.update()
}
animate();
console.log(player);