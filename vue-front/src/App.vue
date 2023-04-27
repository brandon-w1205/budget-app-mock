<script setup lang="ts">
import GetStarted from './components/GetStarted.vue'
import Dashboard from './components/Dashboard.vue'
import DoughnutChart from './components/charts/DoughnutChart.vue';
</script>

<template>
  <!-- <HelloWorld msg="Vite + Vue + TS" /> -->
  <!-- <Dashboard /> -->
  <router-link to="/">Home</router-link>
  |
  <router-link to="/dashboard">Dashboard</router-link>
  <router-view></router-view>

  <!-- testing -->
  
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}

.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}

.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
