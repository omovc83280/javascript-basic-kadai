const btn = document.getElementById('btn');

const text = document.getElementById('text');

btn.addEventListener('click',() =>{
  text.style.display='none';
  const childList = document.createElement('h2');
  childList.textContent = 'ボタンをクリックしました';
  const body = document.querySelector("body");
  body.appendChild(childList);
});