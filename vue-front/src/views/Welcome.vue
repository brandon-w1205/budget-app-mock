<script setup lang="ts">
import { ref, onMounted } from 'vue'


let budgets = ref()

function allBudgets() {
    fetch("http://localhost:8080/budgets")
        .then(res => res.json())
        .then(actualD => budgets.value = actualD)
        // .catch(err => console.log(err.message))
    }

    

onMounted(() => {

    allBudgets()
   

})


</script>

<template>
    <div class="home">
        <h1>Home</h1>
        <p></p>
        <router-link to="/dashboard">Go to Dashboard</router-link>
    </div>

    <div>
        <p v-for="object in budgets" :key="object">
            {{ object.name }}
            {{ object.amount }}
            {{ object.expense }}
        </p>
    </div>
</template>