(function(b){b.createHipChat=function(m){if(m&&m.url&&m.container&&m.timezone){var h=b(m.container);if(h.length===0){return}var j={minimal:1,anonymous:0,timezone:m.timezone,name:b("username").value};if(m.welcome){j.welcome_msg=m.welcome}var n=m.url+(m.url.indexOf("?")>0?"&":"?")+b.param(j);if(n.indexOf("https://")!==0){n="https://"+n}var a=m.width||"100%";var l=m.height||400;var k=(m.noframes||"");return{show:function(){h.html('<iframe src="'+n+'" frameborder="'+0+'" width="'+a+'" height="'+l+'">'+k+"</iframe>")}}}};b.fn.hipChatPanel=function(d){d.container=this[0];var a=b.createHipChat(d);this.html('<button class="show-hipchat '+d.buttonClasses+'">'+(d.buttonTitle||"Chat")+"</button>").find(".show-hipchat").click(function(c){a.show()})}}(jQuery));