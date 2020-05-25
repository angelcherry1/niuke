<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <h1>快输入你的账号吧！</h1>
  </div>
</template>

<script>
export default {
  name: 'Log',
  data () {
    return {
      msg: '欢迎来到登录界面！'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
