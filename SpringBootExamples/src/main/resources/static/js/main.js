window.onload = function() {
  initList();
}

function loadData() {
  var data = [
              {name : 'Cyan Raphael Yi', tel : '000-0000-0000'},
              {name : '시안', tel : '000-1111-0000'},
              {name : 'Sol Yi', tel : '000-2222-0000'},
              {name : 'May Lim', tel : '000-0000-3333'},
              {name : 'Kent Beck', tel : '444-0000-0000'},
              ]
  return data;
}

function initList () {
  var data = loadData();

  data.map(function(m) {
    var liNode = document.createElement("LI");
    var nameSpan = document.createElement("SPAN");
    nameSpan.appendChild(document.createTextNode(m.name));
    liNode.appendChild(nameSpan);
    liNode.appendChild(document.createTextNode(m.tel));
    document.getElementById('mainList').append(liNode);
  });
}