let submit = document.getElementById('button');
let title = document.getElementById('title');
let content = document.getElementById('content');
let parent = document.getElementById('postparent');

submit.onclick = function() {
  let atitle = document.getElementById('title').value;
  let acontent = document.getElementById('content').value;
  if (atitle.length !== 0 && acontent.length !== 0) {
    let postTitle = document.createElement('h1');
    let postContent = document.createElement('p');
    let section = document.createElement('section');
    postTitle.innerText = atitle;
    postContent.innerText = acontent;
    section.appendChild(postTitle);
    section.appendChild(postContent);
    parent.prepend(section);
    console.log(atitle, acontent);
    title.value = '';
    content.value = '';
  }
}