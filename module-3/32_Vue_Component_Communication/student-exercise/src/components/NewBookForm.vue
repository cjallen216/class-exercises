<template>
  <form v-on:submit.prevent="saveBook">
      <div class="form-element">
          <label for="title">Title: </label>
          <input type="text" id="title-input" />
      </div>
      <div class="form-element">
          <label for="author">Author: </label>
          <input type="text" id="author-input" />
      </div>
      <div class="form-element">
          <label for="isbn">ISBN: </label>
          <input type="text" id="isbn-input" />
      </div>
      <input type="submit" value="Save" />
  </form>
</template>

<script>
export default {
    data() {
        return {
            newBook: {
                title: '',
                author: '',
                read: false,
                isbn: ''
            }
        }
    },
    name: 'new-book-form',
    methods: {
        saveBook() {
            this.newBook.read = false;
            this.$store.commit('ADD_BOOK', this.newBook);
            this.newBook = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            };
        }
    }
}
</script>

<style>
div.form-element {
  margin-top: 10px;
}
div.form-element > label {
  display: block;
}
div.form-element > input,
div.form-element > select {
  height: 30px;
  width: 300px;
}
div.form-element > textarea {
  height: 60px;
  width: 300px;
}
form > input[type="button"] {
  width: 100px;
}
form > input[type="submit"] {
  width: 100px;
  margin-right: 10px;
}

</style>